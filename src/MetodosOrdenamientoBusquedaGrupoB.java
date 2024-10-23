import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] people) {
        // TODO: Implement selection sort by age
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int temp = j;
                j = (j + 1);
                j = temp;
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] carros, int age) {
        int inicio = 0;
        int fin = carros.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (carros[medio].getYear() == age) {
                return medio;
            }
            if (carros[medio].getYear() < age) {
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showCarros() {
        // TODO: Implement showPeople
    }
}