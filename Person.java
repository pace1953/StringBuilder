public class Person{
	StringBuilder name;
	StringBuilder phoneNumber;
	
	public Person(String name, String phoneNumber){
		this.name = new StringBuilder(name);
		this.phoneNumber = new StringBuilder(phoneNumber);
	}
	
	public void addLastName(String lastname){
		name.append(" ");
		name.append(lastname);
		
		phoneNumber.insert(2,"-");
		phoneNumber.insert(7,"-");
	}

	public void displayInfo(){
		System.out.println("全名:"+name.toString());
		System.out.println("全名的長度:"+name.length());
		System.out.println("全名的容量:"+name.capacity());
		/*System.out.println("姓氏:"+" ");
		System.out.println("名字:"+name);	*/
		System.out.println("行動電話號碼:"+phoneNumber.toString());
		System.out.println("電話號碼的長度:"+phoneNumber.length());
		System.out.println("電話號碼的容量:"+phoneNumber.capacity());		
	}
}