//package eu.cefim.java;
//
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Main {
//
//    static Connection connection = null;
//    public static void main(String[] args) throws SQLException {
//        // Connection connection = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver trouvé !");
//
//            String user = "root";
//            String password = "cefim";
//            String timezone = "UTC";
//            String url = "jdbc:mysql://localhost:3307/eventcode?serverTimezone=" + timezone;
//            System.out.println("fbbnn");
//            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Je suis connecté !");
//            // toute connexion ouverte doit etre fermee:
//            // requete
//            requetesSql(connection);
//            System.out.println("Connexion OK !");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Driver indispo !");
//        } finally {
//            if (connection == null) {
//                return;
//            }
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                System.out.println("Impossible de fermer la connexion !");
//            }
//        }
//        // System.out.println("C'est Ok");
//    }
//
//    private static void requetesSql(Connection connection) throws SQLException {
//        String query;
//        query = "SELECT count(*) FROM client";
//        Statement stmt = connection.createStatement();
//        ResultSet rs = stmt.executeQuery(query);
//        List<Client> listClients = new ArrayList<>();
//        while (rs.next()) {
//            Client client = new Client();
//            listClients.add(client);
//            String mail = rs.getString("mail");
//            String password = rs.getString("password");
//            System.out.println(mail + " " + password);
//        }
//    }
//
//    private static List<Client> find() throws SQLException {
//        String query = "SELECT c.id, c.mail, c.password, count(*) nb_billets " +
//                "FROM client c " +
//                "LEFT JOIN billet b " +
//                "ON b.achat_client_id = c.id " +
//                "GROUP BY c.id";
//
//        Statement stmt = connection.createStatement();
//        ResultSet rs = stmt.executeQuery(query);
//        List<Client> clients = new ArrayList<>();
//
//        while (rs.next()) {
//            Client client = new Client();
//            client.setId(rs.getInt("id"));
//            client.setMail(rs.getString("mail"));
//            client.setPassword(rs.getString("password"));
//            client.setNbBilletsAchetes(rs.getInt("nb_billets"));
//            clients.add(client);
//        }
//
//        return clients;
//    }
//
////    private static Client findOne(int id) throws SQLException {
////        //        String query = "SELECT * FROM client WHERE id = "+id+" LIMIT 1";
////        //        Statement stmt = connection.createStatement();
////        String query = "SELECT c.id, c.mail, c.password, count(*) nb_billets " +
////                "FROM client c " +
////                "LEFT JOIN billet b " +
////                "ON b.achat_client_id = c.id " +
////                "WHERE c.id = ? " +
////                "LIMIT 1";
////
////        PreparedStatement stmt = connection.prepareStatement(query);
////        stmt.setInt(1, id);
////        ResultSet rs = stmt.executeQuery();
////        Client client = new Client();
////        if (!rs.next())
////            return null;
////        client.setId(rs.getInt("id"));
////        client.setMail(rs.getString("mail"));
////        client.setPassword(rs.getString("password"));
////        client.setNbBilletsAchetes(rs.getInt("nb_billets"));
////        return client;
////    }
////
////    BeanListHandler<Client> beanListHandler = new BeanListHandler<>(Client.class);
////
////    QueryRunner runner = new QueryRunner();
////    String query = "SELECT * FROM client";
////    List<Client> clients = runner.query(connection, query, beanListHandler);
////
////    public static List<Client> findV2(Connection connection) throws SQLException {
////        BeanListHandler<Client> beanListHandler = new BeanListHandler<>(Client.class);
////        QueryRunner runner = new QueryRunner();
////        String query = "SELECT * FROM client";
////        List<Client> clients = runner.query(connection, query, beanListHandler);
////        return clients;
////    }
//}
