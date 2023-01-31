package future.object_oriented4;

class School {
	private final int CAPACITY = 5;
	private static String name;
	private Student[] students;
	public School(String name) {
		School.name = name;
		students = new Student[CAPACITY];
	}
	public void enterSchool(String name) {
		for (int i=0;i<students.length;i++) {
			if (students[i]==null) {
				students[i] = new Student(i+1, name);
				System.out.println(name+"さんが"+School.name+"に入学しました");
				return;
			}
		}
		System.out.println("定員オーバーで"+name+"さんは"+School.name+"に入学できません");
	}
	public void introduce() {
		for (int i=0;i<students.length;i++) {
			if (students[i]!=null) {
				System.out.println(School.name+"に在学している出席番号"+students[i].id+"の"+students[i].name+"です。");
			}
		}
	}
	class Student {
		private int id;
		private String name;
		public Student(int id,String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return School.name+"に在学している出席番号"+id+"の"+name+"です。";
		}
	}
}
