package jproxy;

/**
 * Created by ross.moug on 01/06/2017.
 */
public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRaing();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
