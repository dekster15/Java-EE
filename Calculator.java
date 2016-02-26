/**
 * Created by dekster15 on 26.02.2016.
 */
public class Calculator {
    /**
     Результат обчислень
     */
    private int result;

    /**
     Сумуємо аргументи
     */
    public void add(int ... params){
        for (Integer param : params){
            this.result += param;
        }
    }

    /**
     Отримання результату
     */
    public int getResult(){
        return this.result;
    }

    /**
     Очисчення результату обчислень
     */
    public void cleanerResult(){
        this.result = 0;
    }
}
