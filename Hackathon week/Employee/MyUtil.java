package Employee;

/**
 * Created by marwahh on 7/19/2017.
 */
public class MyUtil {
    public Employee[] sort(Employee[] arr,EmployeeCompareById e) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (e.compare(arr[i],arr[index])>0)
                    index = j;
            Employee min = arr[index];
            arr[index] = arr[i];
            arr[i]=min;
        }
        return arr;
    }
    public Employee[] sort(Employee[] arr,EmployeeCompareByName e) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (e.compare(arr[i],arr[index])>0)
                    index = j;
            Employee min = arr[index];
            arr[index] = arr[i];
            arr[i]=min;
        }
        return arr;
    }

}
