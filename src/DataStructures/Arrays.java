package DataStructures;

public class Arrays {
    public static void main(String[] args) {

        /*************************************
        Working with a single dimension array
         ************************************/
        String[] alphabet = {"a", "b", "c", "d", "e", "f"};

        // Simple for loop to traverse the array
        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();

        // Traversing an array using the for-Each method
        for(String letter : alphabet){
            System.out.print(letter + " ");
        }


        /*************************************
         Working with a Multi dimensional array
         ************************************/

        System.out.print("\n\nWorking with a multi Dimensional array");
        String[][] users = {
                {"Connor" , "Bedard", "connorbedard@gmail.com", "7182191234"},
                {"Matvei", "Michkov", "matveimichkov@gmail.com", "3473456578"},
                {"Alexander", "Ovechkin", "alexanderOvechkin@gmail.com", "6461232345"}};

        //Get the size of the array
        int numOfUsers = users.length;
        int numOfField = users[0].length;

        System.out.println("\nNumber of users: " + numOfUsers);
        System.out.println("Number of fields: " + numOfField);

        // Traversing the double array
        for (int i = 0; i < numOfUsers; i++){
            for (int j = 0; j < numOfField; j++){
                System.out.print(users[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n\n Using FOR EACH");
        // Traversing a multi dimensional array using the for-Each method
        for(String[] user : users){
            System.out.print("{");
            for(String field : user){
                System.out.print(field + " ");
            }
            System.out.println("}");
        }
    }
}
