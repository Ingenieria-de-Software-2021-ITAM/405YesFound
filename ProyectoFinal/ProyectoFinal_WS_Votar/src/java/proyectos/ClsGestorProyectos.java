package proyectos;

/*
 * ClsGestorEscBaile.java
 */
/**
 *
 * @author RGGH
 */
public class ClsGestorProyectos {

    ClsConexion conexion;
// ---------------------------------------------------------------------------    

    public ClsGestorProyectos() {
        String strBD = "proyectos";
        conexion = new ClsConexion(strBD);
    }
// ---------------------------------------------------------------------------        

    public boolean conectaBD(String strUsuario, String strContrasenha) {
        return conexion.conectate(strUsuario, strContrasenha);
    }
// ---------------------------------------------------------------------------        

    public boolean conectado() {
        return conexion.conectado();
    }
// --------------------------------------------------------------------------- 

    public void desconecta() {
        conexion.cierraCon();
    }
// --------------------------------------------------------------------------- 

    public java.sql.ResultSet obtenAlumnos() {
        return conexion.obtenRS("tblAlumnos");
    }
// ---------------------------------------------------------------------------

    public MiModelo obtenAlumno(String clvAlumno) {
        conexion.conectate();
        java.sql.ResultSet rs = conexion.obtenRegSelect("Select * from tblAlumnos where clvAlumno='" + clvAlumno + "' and activo = 1");
        MiModelo elModelo = new MiModelo(rs);
        conexion.desconectate();
        return elModelo;
    }
// ---------------------------------------------------------------------------

    public MiModelo obtenModeloAlumnos() {
        java.sql.ResultSet rs = conexion.obtenRegSelect("Select * from tblAlumnos");
        MiModelo elModelo = new MiModelo(rs);
        return elModelo;
    }
// ---------------------------------------------------------------------------

    public MiModelo obtenVoto(String clvAlumno, String clvContienda) {
        conexion.conectate();
        java.sql.ResultSet rs = conexion.obtenRegSelect("Select * from tblVoto where clvAlumno='" + clvAlumno + "' and clvContienda = '" + clvContienda + "'");
        MiModelo elModelo = new MiModelo(rs);
        conexion.desconectate();
        return elModelo;
    }
// ---------------------------------------------------------------------------    

    public MiModelo obtenProyectos(String clvContienda) {
        conexion.conectate();
        java.sql.ResultSet rs = conexion.obtenRegSelect("Select * from tblProyectos where clvContienda = '" + clvContienda + "'");
        MiModelo elModelo = new MiModelo(rs);
        conexion.desconectate();
        return elModelo;
    }

// ---------------------------------------------------------------------------    
    public MiModelo obtenContiendas(String fecha) {
        conexion.conectate();
        java.sql.ResultSet rs = conexion.obtenRegSelect("Select * from tblContienda where fechaIni <= '" + fecha + "' and fechaFin >= '" + fecha + "'");
        MiModelo elModelo = new MiModelo(rs);
        conexion.desconectate();
        return elModelo;
    }
// ---------------------------------------------------------------------------    

    public java.sql.ResultSet obtenBailes() {
        return conexion.obtenRS("tblBailes");
    }
// ---------------------------------------------------------------------------    

    public java.sql.ResultSet obtenNiveles() {
        return conexion.obtenRS("tblNiveles");
    }
// ---------------------------------------------------------------------------    

    public java.sql.ResultSet obtenGrupos() {
        return conexion.obtenRS("tblGrupos");
    }
// ---------------------------------------------------------------------------    

    public java.sql.ResultSet obtenAlumnosPorGrupo(String numGpo) {
        return null;
    }
// ---------------------------------------------------------------------------
//                           Obtener un solo campo
// ---------------------------------------------------------------------------

    public java.sql.ResultSet obtenCampoParaLista(String strTV, String strCampo) {
        String strSelect = "Select " + strCampo + " From " + strTV;
        return conexion.obtenRegSelect(strSelect);
    }
// ---------------------------------------------------------------------------    
//                            Altas de registros 
// ---------------------------------------------------------------------------

    public boolean altaVoto(String arr_nomCampos[], String arr_datos[]) {
        conexion.conectate();
        int i, n;
        // clvAlumno, clvContiend, clvProyecto
        // se obtiene la colección de campos de la tabla de los alumnos
        java.util.TreeMap<String, ClsCampoBD> colCampos = conexion.obtenMapaCampos(conexion.obtenRS("tblVoto"));
        n = arr_nomCampos.length;
        // se rellena el valor para cada campo
        for (i = 0; i < n; i++) {
            ((ClsCampoBD) colCampos.get(arr_nomCampos[i])).valor = arr_datos[i];
        }

        // se solicita al objeto conexión que inserte el registro y se espera el resultado
        Boolean ans = conexion.insertaReg("tblVoto", colCampos);
        conexion.desconectate();
        return ans;
    }
// ---------------------------------------------------------------------------    

    public boolean modificaAlumno(MiModelo mm) {
        int col, colCve = -1;
        String strCve = null;

        int numCampos = mm.getColumnCount();
        String[] strNomDatos = new String[numCampos];
        String[] strDatos = new String[numCampos];

        for (col = 0; col < numCampos; col++) {
            strNomDatos[col] = mm.getColumnName(col);
            strDatos[col] = (String) mm.getValueAt(0, col);
            System.out.println(col + " -> " + strNomDatos[col] + ":" + strDatos[col]);
            if (strNomDatos[col].toLowerCase().startsWith("clv")) {
                colCve = col;
                strCve = strDatos[col];
            }
        }
        java.util.TreeMap<String, ClsCampoBD> colCampos
                = conexion.obtenMapaCampos(conexion.obtenRegSelect("Select * from TBLALUMNOS where CLVALUMNO ='" + strCve + "';"));

        for (col = 0; col < numCampos; col++) {
            colCampos.get(strNomDatos[col].toUpperCase()).valor = strDatos[col];
        }
        colCampos.get(strNomDatos[colCve].toUpperCase()).valWhere = strCve;

        return conexion.modificaReg("TBLALUMNOS", colCampos);

    }

// ---------------------------------------------------------------------------    
    public boolean altaProfesor() {
        return true;
    }
// ---------------------------------------------------------------------------    

    public boolean altaBaile() {
        return true;
    }
// ---------------------------------------------------------------------------    

    public boolean altaNivel() {
        return true;
    }
// ---------------------------------------------------------------------------    

    public boolean altaGrupo() {
        return true;
    }
// ---------------------------------------------------------------------------    

    public boolean altaAlumnoEnGrupo(String numGpo, String clvAlumno) {
        return true;
    }
// ---------------------------------------------------------------------------    
// ---------------------------------------------------------------------------    
// ---------------------------------------------------------------------------    
// ---------------------------------------------------------------------------    

}
