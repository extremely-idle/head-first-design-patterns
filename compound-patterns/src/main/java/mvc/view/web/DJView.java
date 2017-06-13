package mvc.view.web;

import mvc.model.beat.BeatModel;
import mvc.model.beat.BeatModelImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by ross.moug on 13/06/2017.
 */
public class DJView extends HttpServlet {

    public void init() {
        BeatModel model = new BeatModelImpl();
        model.init();
        getServletContext().setAttribute("model", model);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BeatModel model = (BeatModel) getServletContext().getAttribute("model");

        String bpm = request.getParameter("bpm");
        if (bpm == null) {
            bpm = model.getBPM() + "";
        }

        String set = request.getParameter("set");
        if (set != null) {
            int bpmNumber = 90;
            bpmNumber = Integer.parseInt(bpm);
            model.setBPM(bpmNumber);
        }

        String decrease = request.getParameter("decrease");
        if (decrease != null) {
            model.setBPM(model.getBPM() - 1);
        }

        String increase = request.getParameter("increase");
        if (increase != null) {
            model.setBPM(model.getBPM() + 1);
        }

        String on = request.getParameter("on");
        if (on != null) {
            model.on();
        }

        String off = request.getParameter("off");
        if (off != null) {
            model.off();
        }

        request.setAttribute("model", model);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DJView.jsp");
        dispatcher.forward(request, response);
    }
}
