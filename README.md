# touseyamlfile

to use snakeyaml in maven 

<dependency>
    <groupId>org.yaml</groupId>
    <artifactId>snakeyaml</artifactId>
    <version>${org.snakeyaml.version}</version>
</dependency>
 
 
 to use snakeyaml in gradle
 
 
 compile group: 'org.yaml', name: 'snakeyaml', version: '{version}'
 
 
 
 
 
 use 3 layer file as map in java
 id: 20
name: Bruce
year: 2020
address: Gotham City
department: Computer Science





java code for yaml file

 InputStream inputStream = new FileInputStream(new File("student.yml"));

Yaml yaml = new Yaml();
Map<String, Object> data = yaml.load(inputStream);
System.out.println(data);
















