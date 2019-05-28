import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Main {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DBWorker worker= new DBWorker();



        List<Person> personList = new ArrayList<>();

       try {

           Statement statement = worker.getConnection().createStatement();
            String query = "select * from subs e " +
                   "left join person s on (e.person_id = s.id)";

           ResultSet resultSet=statement.executeQuery(query);

           while(resultSet.next()){
                   Subs subs=new Subs();


                   LocalDate kol = new java.sql.Date(resultSet.getDate(3).getTime()).toLocalDate();
                   LocalDate pol = new java.sql.Date(resultSet.getDate(4).getTime()).toLocalDate();
                   subs.setId(resultSet.getInt(1));
                   subs.setDateOfS(kol);
                   subs.setDateOfF(pol);
                   int i=subs.getResult(kol,pol);
                   System.out.println(subs+"число месяцев оформелню подписки"+abs(i));

           }

    } catch (SQLException e) {
           e.printStackTrace();
       }


    }
}