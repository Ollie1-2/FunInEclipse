
public class Amazonpackaging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box[] myboxs = new Box[3]; 
Box a = new Box(1,1,1);
Box b = new Box(2,2,2);
Box c = new Box(3,3,3);


myboxs[0]=a;
myboxs[1]=b;
myboxs[2]=c;
int z=myboxs.length;

for(int i=0; i<2; i++){
c.InsertABox(myboxs[i]);
}

	}
}
