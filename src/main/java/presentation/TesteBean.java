package presentation;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TesteBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public String ajuda() {
        return "AjudaGestaoEmpresas?faces-redirect=true";
    }
    
    public String gestao() {
        return "GestaoEmpresas?faces-redirect=true";
    }
}