import models.Carro;
import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] cars) {
        for (int i = 0; i < cars.length; i++){
            boolean intercambio = false;
            for (int j = 0; j < cars.length - 1 - i; j++){
                if (cars[j].getYear() > cars[j + 1].getYear()){
                    Carro aux = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio){
                break;
            }
        }
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            boolean intercambio = false;
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYear() < cars[j + 1].getYear()){
                    Carro aux = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio){
                break;
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] cars, int year) {
        int inicio = 0;
        int fin = cars.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (cars[medio].getYear() == year) {
                return medio;
            }
            if (cars[medio].getYear() < year) {
                inicio = medio + 1;
            }
            if (cars[medio].getYear() > year){
                fin = medio - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showCarros(Carro[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].getName() + " ");
            System.out.print("modelo: " + cars[i].getModel() + " ");
            System.out.print("año: " + cars[i].getYear() + " " + "\n");
        }
    }

    public void printObject(Carro carro){
        System.out.println(carro.getName() + "  modelo: " + carro.getModel() 
        + "  año: " + carro.getYear());
    }
}