public class ClassSrting {
    public static void main(String[] args){
        String data = "01.12.2022";
        String day = data.substring(0,2);
        String month = data.substring(3,5);
        String year = data.substring(6);

        int day1 = Integer.parseInt(day);
        int month1 = Integer.parseInt(month);
        int year1 = Integer.parseInt(year);
        System.out.print(day1 +".");
        System.out.print(month1+".");
        System.out.print(year1);
    }
}
