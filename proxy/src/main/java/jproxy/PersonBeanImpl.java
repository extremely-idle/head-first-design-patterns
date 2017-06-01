package jproxy;

/**
 * Created by ross.moug on 01/06/2017.
 */
public class PersonBeanImpl implements PersonBean {
    private String name;
    private String gender;
    private String interests;
    private int rating;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRaing() {
        return rating;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating = rating;
    }
}
