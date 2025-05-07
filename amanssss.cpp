#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

// Function to add a record to a file
void addRecord(const string& filename, const string& record) {
    ofstream file;
    file.open(filename, ios::app);  // Open in append mode
    if (file.is_open()) {
        file << record << endl;
        cout << "Record added successfully!" << endl;
        file.close();
    } else {
        cout << "Error opening the file!" << endl;
    }
}

// Function to delete a record from the file
void deleteRecord(const string& filename, const string& recordToDelete) {
    ifstream file;
    ofstream tempFile;
    string line;
    bool found = false;

    file.open(filename);
    tempFile.open("temp.txt");

    if (!file.is_open() || !tempFile.is_open()) {
        cout << "Error opening the file!" << endl;
        return;
    }

    while (getline(file, line)) {
        if (line != recordToDelete) {
            tempFile << line << endl;
        } else {
            found = true;
        }
    }

    file.close();
    tempFile.close();

    // Replace original file with the temporary file
    if (found) {
        remove(filename.c_str());
        rename("temp.txt", filename.c_str());
        cout << "Record deleted successfully!" << endl;
    } else {
        cout << "Record not found!" << endl;
        remove("temp.txt");
    }
}

// Function to find a record in the file
void findRecord(const string& filename, const string& recordToFind) {
    ifstream file;
    string line;
    bool found = false;

    file.open(filename);
    if (file.is_open()) {
        while (getline(file, line)) {
            if (line == recordToFind) {
                cout << "Record found: " << line << endl;
                found = true;
                break;
            }
        }
        if (!found) {
            cout << "Record not found!" << endl;
        }
        file.close();
    } else {
        cout << "Error opening the file!" << endl;
    }
}

// Function to delete the entire file
void deleteFile(const string& filename) {
    if (remove(filename.c_str()) == 0) {
        cout << "File deleted successfully!" << endl;
    } else {
        cout << "Error deleting the file!" << endl;
    }
}

int main() {
    string filename = "records.txt";
    int choice;
    string record;
    
    while (true) {
        cout << "\nFile Handling Menu\n";
        cout << "1. Add Record\n";
        cout << "2. Delete Record\n";
        cout << "3. Find Record\n";
        cout << "4. Delete File\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;
        cin.ignore();  // Ignore the newline character after input

        switch (choice) {
            case 1:
                cout << "Enter the record to add: ";
                getline(cin, record);
                addRecord(filename, record);
                break;

            case 2:
                cout << "Enter the record to delete: ";
                getline(cin, record);
                deleteRecord(filename, record);
                break;

            case 3:
                cout << "Enter the record to find: ";
                getline(cin, record);
                findRecord(filename, record);
                break;

            case 4:
                deleteFile(filename);
                break;

            case 5:
                cout << "Exiting program..." << endl;
                return 0;

            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    }

    return 0;
}
