import java.sql.*;
import java.util.*;

public class QUERIES {
    private static final String URL = "jdbc:postgresql://10.62.73.22:5432/l3n10";
    private static final String USERNAME = "l3n10";
    private static final String PASSWORD = "rumoao20";
    private static Connection connection = null;
    private static Statement stmt = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;

    public static List<Integer> getIdTipos() throws SQLException {return stQueryResListInt("select id from ACTIVOTIPO");}
    public static List<Integer> getEquipas() throws SQLException {return stQueryResListInt("select distinct equipa from pessoa");}
    public static List<String> getAtivos() throws SQLException {return stQueryResListString("select nome from ACTIVO");}
    public static List<String> getIdAtivos() throws SQLException {return stQueryResListString("select id from ACTIVO");}
    public static List<String> getNomePessoas() throws SQLException {return stQueryResListString("select nome from PESSOA");}
    public static List<String> getEmpresas() throws SQLException {return stQueryResListString("select nome from EMPRESA");}
    public static String getIdAtivo(String name) throws SQLException{return pstQueryResString("select id from ACTIVO where nome = ?", name);}
    public static int getIdPessoa(String name) throws SQLException{return pstQueryResInt("select id from PESSOA where nome = ?", name);}
    public static int getIdEmpresa(String name) throws SQLException{return pstQueryResInt("select id from EMPRESA where nome = ?", name);}
    public static int getIdTipoFromAtivo(String ativo) throws SQLException{
        return pstQueryResInt("select activotipo.id from (ACTIVO join activotipo on tipo = activotipo.id) where activo.id = ?", ativo);
    }
    public static Connection con() throws SQLException {
        return  DriverManager.getConnection(URL, USERNAME, PASSWORD);
        //return DriverManager.getConnection("jdbc:postgresql://10.62.73.22:5432/?user=l3n10&password=rumoao20");
    }











}
