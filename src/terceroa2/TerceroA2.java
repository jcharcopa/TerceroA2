package terceroa2;

import archivos.Archivo;
import domain.Usuario;
import java.util.List;
import vistas.Ventana1;

public class TerceroA2 {

    public static void main(String[] args) {
        Archivo arch = new Archivo();
        String ruta = "C:\\TerceroA2\\usuario.csv";
        List<Usuario> lista = arch.getAll(ruta);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre()+" " + lista.get(i).getApellidos());
        }
//      //  var usuario = "Diego Rivera";
//        Usuario obj = arch.getOne(ruta, usuario);
//        if (obj == null){
//            System.out.println("Error");
//            
//        }
//        else {
//            System.out.println(obj.getUsuario()+" "+ obj.getNombre()+" "+ obj.getApellidos());
//        }
        // var ven = new Ventana1();
        //     ven.setVisible(true);
//        Usuario obj = new Usuario("Jorman 1" , "1324", "Gonzales","Rodriguez","rodriguez@gmail.com");
//        var msg = arch.update (ruta, obj);
     var msg1 = arch.delete(ruta, "Jorman");
        System.out.println(msg1);
    }

}
