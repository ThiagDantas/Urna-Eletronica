
package classes;

import view.viewPrincipal;

/**
 *
 * @author thiag
 */
public class RunUrnaRun {
    public static void main(String[] args) {
        Urna nvUrna = new Urna(1);
        viewPrincipal principal=new viewPrincipal(nvUrna);
        principal.setVisible(true);
    }
}
