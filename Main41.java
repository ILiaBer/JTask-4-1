public class Main41 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(6600);
        System.out.println(miles);
    }
}