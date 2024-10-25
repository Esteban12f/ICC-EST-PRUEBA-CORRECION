import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        for (int i = 0; i < people.length; i++){
            int key = i;
            for (int j = i + 1; j < people.length; j++){
                if (people[j].getAge() < people[key].getAge()){
                    key = j;
                }
            }
            Person aux = people[key];
            people[key] = people[i];
            people[i] = aux;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        for (int i = 0; i < people.length; i++){
            int key = i;
            for (int j = i + 1; j < people.length; j++){
                if (people[j].getHeight() < people[key].getHeight()){
                    key = j;
                }
            }
            Person aux = people[key];
            people[key] = people[i];
            people[i] = aux;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        for (int i = 0; i < people.length; i++){
            Person aux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > aux.getAge()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = aux;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        for (int i = 0; i < people.length; i++){
            Person aux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > aux.getHeight()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = aux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int inicio = 0;
        int fin = people.length - 1;
        while (inicio <= fin){
            int medio = inicio - (inicio - fin) / 2;
            if (people[medio].getAge() == age){
                return medio;
            }

            if (people[medio].getAge() < age){
                inicio = medio + 1;
            }

            if (people[medio].getAge() > age){
                fin = medio - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        int inicio = 0;
        int fin = people.length - 1;
        while (inicio <= fin){
            int medio = inicio - (inicio - fin) / 2;
            if (people[medio].getHeight() == height){
                return medio;
            }

            if (people[medio].getHeight() < height){
                inicio = medio + 1;
            }

            if (people[medio].getHeight() > height){
                fin = medio - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i].getName() + " ");
            System.out.print("edad: " + persons[i].getAge() + " ");
            System.out.print("altura: " + persons[i].getHeight() + " " + "\n");
        }
    }

    public void printObject(Person person){
        System.out.println(person.getName() + "  edad: " + person.getAge() 
        + "  altura: " + person.getHeight());
    }
}