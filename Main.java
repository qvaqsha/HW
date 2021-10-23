package JavaCore.HW2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arrays = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"5","6","7","8"},
                {"5","6","7","2"}};

        if (arrays.length !=4) throw new MyArraySizeException();
        if (arrays[0].length !=4) throw new MyArraySizeException();
        int sum=0;
        for(int i = 0 ; i < arrays.length; i++){
            for(int a = 0; a<arrays[i].length;a++){
                try {
                    sum +=Integer.parseInt(arrays[i][a]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Неверные данные" + i + " " + a);
                }
            }
        }
        System.out.println(sum);
    }
}
