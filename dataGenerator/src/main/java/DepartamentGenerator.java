public class DepartamentGenerator {

    public static void main(String[] args) {


        for(int i = 0; i < 10;i++){
            System.out.println(generateSql(i));
        }


    }


    private static String generateSql(int id){
        String departamentName = "departament";

        StringBuffer sql = new StringBuffer();

        sql.append("insert into departaments (id, name) values (");
        sql.append(id);
        sql.append(", '");
        sql.append(departamentName+id);
        sql.append("');");

        return sql.toString();
    }

}
