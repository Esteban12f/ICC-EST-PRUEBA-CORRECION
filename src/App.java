
import models.Carro;
import models.CarrosGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generadas:");
        for (int i = 0; i < carros.length; i++) {
            System.out.print(carros[i].getName() + " ");
            System.out.print(carros[i].getModel() + " ");
            System.out.print(carros[i].getYear() + " " + "\n");
        }
        MetodosOrdenamientoBusquedaGrupoB ordenar = new MetodosOrdenamientoBusquedaGrupoB();
        ordenar.sortBYearWithBubbleAvnDesendente(carros);
        System.out.println(carros);
    }
}
