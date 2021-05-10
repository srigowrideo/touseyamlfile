package fibonacciseries;

public class javawithyamlfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = new FileInputStream(new File("student.yml"));

		Yaml yaml = new Yaml();
		Map<String, Object> data = yaml.load(inputStream);
		System.out.println(data);
	}

}
