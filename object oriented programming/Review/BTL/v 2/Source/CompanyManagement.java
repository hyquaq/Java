import java.util.*;
import java.io.*;

class MySort implements Comparator<Employee> {
  @Override
  public int compare(Employee a, Employee b) {
    if (a.getSalary() == b.getSalary()) {
      String nameA = a.getEmpName().split(" ")[a.getEmpName().split(" ").length - 1];
      String nameB = b.getEmpName().split(" ")[b.getEmpName().split(" ").length - 1];
      return nameA.charAt(0) > nameB.charAt(0) ? 1 : -1;
    }
    return a.getSalary() < b.getSalary() ? 1 : -1;
  }
}

public class CompanyManagement<E> {
  private ArrayList<Employee> empList;

  // path: path of ListOfEmployees, path1: path of PLInfo.txt
  public CompanyManagement(String path, String path1) throws FileNotFoundException {
    empList = getEmployeeFromFile(path, path1);
  }

  // Phan code cua sinh vien
  public ArrayList<String> getLanguages(String id, ArrayList<String> languagesList) {
    ArrayList<String> languages = new ArrayList<String>();
    for (String element : languagesList) {
      String[] cells = element.split(",");
      if (cells[0].equals(id)) {
        languages.addAll(Arrays.asList(Arrays.copyOfRange(cells, 1, cells.length)));
      }
    }
    return languages;
  }

  // path: path of ListOfEmployees.txt, path1: path of PLInfo.txt
  public ArrayList<Employee> getEmployeeFromFile(String path, String path1) throws FileNotFoundException {
    ArrayList<String> languagesList = new ArrayList<String>();
    ArrayList<Employee> employees = new ArrayList<Employee>();
    File file = new File(path1);
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      languagesList.add(line);
    }
    sc.close();

    file = new File(path);
    sc = new Scanner(file);
    while (sc.hasNextLine()) {
      String[] words = sc.nextLine().split(",");
      Employee employee = new Developer();
      if (words[1].charAt(0) == 'T') {
        employee = new Tester(words[1], words[2], Integer.valueOf(words[5]), Double.valueOf(words[3]), words[4]);
      } else if (words.length == 6) {
        ArrayList<String> programLanguages = getLanguages(words[1], languagesList);
        employee = new Developer(words[1], words[2], Integer.valueOf(words[5]), words[3], programLanguages,
            Integer.valueOf(words[4]));
      } else {
        ArrayList<String> programLanguages = getLanguages(words[1], languagesList);
        employee = new TeamLeader(words[1], words[2], Integer.valueOf(words[7]), words[3], programLanguages,
            Integer.valueOf(words[4]), Double.valueOf(words[6]));
      }
      employees.add(employee);
    }

    sc.close();
    return employees;
  }

  public ArrayList<Developer> getDeveloperByProgrammingLanguage(String pl) {
    ArrayList<Developer> result = new ArrayList<Developer>();
    for (Employee employee : empList) {
      if (employee instanceof Developer) {
        Developer developer = (Developer) employee;
        if (developer.getProgrammingLanguages().contains(pl)) {
          result.add(developer);
        }
      }
    }
    return result;
  }

  public ArrayList<Tester> getTestersHaveSalaryGreaterThan(double value) {
    ArrayList<Tester> result = new ArrayList<Tester>();
    for (Employee employee : empList) {
      if (employee instanceof Tester) {
        Tester tester = (Tester) employee;
        if (tester.getSalary() > value) {
          result.add(tester);
        }
      }
    }
    return result;
  }

  public Employee getEmployeeWithHigestSalary() {
    int position = 0;
    for (int i = 0; i < empList.size(); i++) {
      if (empList.get(i).getSalary() >= empList.get(position).getSalary()) {
        position = i;
      }
    }

    return empList.get(position);
  }

  public TeamLeader getLeaderWithMostEmployees() {
    HashSet<String> groups = new HashSet<String>();
    HashMap<String, Integer> countGroups = new HashMap<String, Integer>();
    for (Employee employee : empList) {
      if (employee instanceof TeamLeader) {
        groups.add(((TeamLeader) employee).getTeamName());
      }
    }

    for (String group : groups) {
      int countGroup = 0;
      for (Employee employee : empList) {
        if (employee instanceof Developer) {
          Developer developer = (Developer) employee;
          if (developer.getTeamName().equals(group)) {
            countGroup += 1;
          }
        }
      }
      countGroups.put(group, countGroup);
    }

    String nameGroup = "";
    int sl = 0;
    for (String key : countGroups.keySet()) {
      if (countGroups.get(key) > sl) {
        nameGroup = key;
        sl = countGroups.get(key);
      }
    }

    for (Employee employee : empList) {
      if (employee instanceof TeamLeader && ((TeamLeader) employee).getTeamName().equals(nameGroup)) {
        return (TeamLeader) employee;
      }
    }
    return null;
  }

  public ArrayList<Employee> sorted() {
    ArrayList<Employee> result = empList;
    Collections.sort(result, new MySort());
    return result;
  }

  // -------------------------------------------------------------------

  // Print empList
  public void printEmpList() {
    for (Employee tmp : empList) {
      System.out.println(tmp);
    }
  }

  // Methods for writing file
  public <E> boolean writeFile(String path, ArrayList<E> list) {
    try {
      FileWriter writer = new FileWriter(path);
      for (E tmp : list) {
        writer.write(tmp.toString());
        writer.write("\r\n");
      }
      writer.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error.");
      return false;
    }
    return true;
  }

  public <E> boolean writeFile(String path, E object) {
    try {
      FileWriter writer = new FileWriter(path);
      writer.write(object.toString());
      writer.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error.");
      return false;
    }
    return true;
  }
}