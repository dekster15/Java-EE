/**
 * Created by dekster15 on 26.02.2016.
 */
public class Calculator {
    /**
     ��������� ���������
     */
    private int result;

    /**
     ������ ���������
     */
    public void add(int ... params){
        for (Integer param : params){
            this.result += param;
        }
    }

    /**
     ��������� ����������
     */
    public int getResult(){
        return this.result;
    }

    /**
     ��������� ���������� ���������
     */
    public void cleanerResult(){
        this.result = 0;
    }
}
