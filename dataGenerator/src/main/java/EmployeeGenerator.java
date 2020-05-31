import java.util.Random;

public class EmployeeGenerator {



    public static void main(String[] args) {

        Random random = new Random();

        for(int i = 0; i < 1000;i++){
            int departamentID = random.nextInt(10);
            if(random.nextBoolean()){
                System.out.println(generateSql(i, "M", departamentID));
            }else{
                System.out.println(generateSql(i, "F", departamentID));
            }

        }

    }
    private static String generateSql(int id, String sex, int departamentId){
        String imie = "imie";
        String nazwisko = "nazwisko";
        String date = "1986-02-10";
        Random random = new Random();
        if (random.nextBoolean()){
            date = "1976-02-10";
        }


        StringBuffer sql = new StringBuffer();

//        sql.append("insert into employee (id, name, surname,birthday, gender,departament_id) values (1,\"Sebastian\", \"Strzalkowski\", \"1996-02-10\", \"M\",0);");
        sql.append("insert into employee (id, name, surname,birthday, gender,departament_id) values (");
        sql.append(id);
        sql.append(", '");
        sql.append(imie+id);
        sql.append("', '");
        sql.append(nazwisko+id);
        sql.append("', '");
        sql.append(date);
        sql.append("', '");
        sql.append(sex);
        sql.append("', ");
        sql.append(departamentId);
        sql.append(");");

        return sql.toString();
    }
}
