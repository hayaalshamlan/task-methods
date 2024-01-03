    import java.util.ArrayList;
    import java.util.List;


    public class SummationPractice {
    public static void main(String[] args) throws Exception {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        System.out.println(numbers);

        SummationMethod(numbers);
        System.out.println(SummationMethod(numbers));


    }

public static int SummationMethod(List<Integer> inpuList) {

    int sum = 0;

    for(int number : inpuList) {

        sum+=number;

    }

        // for(int i = 0; i< inpuList.size(); i++){

        //     sum+=inpuList.get(i);
        // }
        // System.out.println(sum);

    return sum;
}
    
}






