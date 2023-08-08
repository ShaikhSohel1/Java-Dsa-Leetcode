package stacksAndQueues;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if (this.isFull()){
            resize(data);
        }
        return super.push(item);
    }

    private void resize(int[] data){
        int[] temp = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data =temp;
    }
}
