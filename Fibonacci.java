public class Fibonacci {
   
   //Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    //якщо число не можливо вирахувати поверніть -1
    public long getNumber(int position){
   long result;
        if (position <= 0) {
            result = -1;
        } else if (position == 1 || position == 2) {
            result = 1;
        } else {
            result = getNumber(position - 1) + getNumber(position - 2);
        }
        return result;
    }
}
