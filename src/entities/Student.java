package entities;

public class Student {

		public String name;
		private Integer code;
		public double grade1;
		public double grade2;
		public double grade3;
		
		public Student() {
		}
		
		public Student(String name, Integer code) {
			this.name = name;
			this.code = code;
		}
				
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((code == null) ? 0 : code.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (code == null) {
				if (other.code != null)
					return false;
			} else if (!code.equals(other.code))
				return false;
			return true;
		}

		public double finalGrade() {
			return grade1 + grade2 + grade3;
		}
		
		public double missingPoints () {
			return 60 - finalGrade();
		}
}
