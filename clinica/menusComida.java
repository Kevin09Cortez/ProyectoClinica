
package clinica;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo Cuéllar
 */
public class menusComida extends clinica
{
    private String menuDelDia, bebidas;
    public menusComida(Double precioComida, Double cobrarComida, String menuDelDia, String bebidas)
    {
        Super(precioComida, cobrarComida); 
        this.menuDelDia = menuDelDia; 
        this.bebidas = bebidas; 
    }

    menusComida() {
        throw new UnsupportedOperationException("Hola"); 
    }
    private void Super(Double precioComida, Double cobrarComida) {
        throw new UnsupportedOperationException(); 
    }
    comidasjsjs comida1=new comidasjsjs() {
        @Override
        public void comidas() 
        {
            
        }
    };
    public void preciorefrigerio()
    {
        JOptionPane.showMessageDialog(null, "El precio seria: ");
    }
    
 
}
