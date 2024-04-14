// StaffFile class to manage staff data

import java.util.List;
import java.util.ArrayList;

class StaffFile {
    private List<Staff> staffList;

    public StaffFile() {
        staffList = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void removeStaffById(int id) {
        staffList.removeIf(staff -> staff.getId() == id);
    }

    public Staff findStaffById(int id) {
        for (Staff staff : staffList) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }

    public List<Staff> getAllStaff() {
        return staffList;
    }
}