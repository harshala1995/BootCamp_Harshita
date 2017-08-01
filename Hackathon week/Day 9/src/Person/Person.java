package Person;

/**
 * Created by marwahh on 7/21/2017.
 */
public class Person {
    String name;
    String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        String check = null;
        if(o == null || ((Person)o).getName()== check || ((Person)o).getGender().equals(null))
        {
            return false;
        }
        else if (((Person)o).getName().equals(this.getName()) && ((Person)o).getGender().equals(this.getGender()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}