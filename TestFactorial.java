class TestFactorial{
    public static void main(String args[]){
        Factorial factorial = new Factorial();
        try{
            if(factorial.factorial(5) != 120){
                throw new Exception("Test failed: factorial(5) should be 120");
            }
             if(factorial.factorial(0) != 1){
                throw new Exception("Test failed: factorial(0) should be 1");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}