package adminLogBook;

import java.sql.*;

// klasa do połaczenia z bazą danych

    class DB
    {
        public DB(){}

        public void dbConnect(String db_connect_string, String db_userid, String db_password)
        {
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
                System.out.println("connected");

                Statement statement = conn.createStatement();
                statement = conn.createStatement();
                String queryString = "select * from darzak.dbo.logbook";
                ResultSet rs = statement.executeQuery(queryString);
                while (rs.next()){
                    System.out.println(rs.getString(1));
                }
                conn.close();

            }
            catch (Exception e)
            {
                e.printStackTrace();

            }
        }
    }

