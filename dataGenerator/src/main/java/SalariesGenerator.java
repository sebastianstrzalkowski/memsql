import java.util.Random;

public class SalariesGenerator {

    public static void main(String[] args) {


        for(int i = 0; i < 1000;i++){
            System.out.println(generateSql(i));
        }


    }


    private static String generateSql(int id){

        String dateEnd = "1997-02-10";
        Random random = new Random();
        if(random.nextBoolean()){
            dateEnd = "2000-02-10";
        }
        int salary = random.nextInt(10000);
        StringBuffer sql = new StringBuffer();

        sql.append("insert into salaries (id, employee_id, salary, fromDate, toDate) values (");
        sql.append(id);
        sql.append(", ");
        sql.append(id);
        sql.append(", ");
        sql.append(salary);
        sql.append(", '");
        sql.append("1992-02-10");
        sql.append("', '");
        sql.append(dateEnd);
        sql.append("');");

        return sql.toString();
    }
}
