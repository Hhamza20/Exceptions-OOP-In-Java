public class Main {
    public static void main(String[] args) {
        //Exception is unexpected behaviour of program and program is aborted. Program normal flow is terminated
        //File reading data from non-existing file
        //Accessing non-existing address on an array like arr[102] from arr[100]
        //Arithmetic exceptions like taking string in integer variable
        //Division by zero is also un-normal situation.
        //If exceptions not handled, program terminate abnormally!
        //Use exception handling to avoid this unexpected flow of program . We use checks to see if exception is occurring so we could handle it and is a safe way to get out of exceptions
        //Checked and unchecked exceptions in java!!!!!!!!!
        //Checked exceptions are forced by compiler to handle them. If these are not handled, compiler doesn't compile the program. Like opening a file. So we get error!
        //Unchecked exceptions are not forced by compiler and are carefully added by the user!

        /* try{ Code here where there are possibilities of getting error!  } in try block......
        catch{  Tell which type of exception occurring possibility is here. We pass exception object here like FileNotFound e  } Here user will be shown appropriate error message......
         */

        //If no catch block of exceptions, then we get program terminated!!!
        //ie. multiple catch block can be used
        //Number format exceptions say that converting int to string eg
        //In arithimetic exceptions like dividing number by 0
        //Exception class is main class of all these exceptions. like catch(Exceptions e) //it will have many benefits
        //it captures every exception but one drawback is that we don't get to know which type of exception occur

    }
}