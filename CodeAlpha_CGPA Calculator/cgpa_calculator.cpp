#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    float totalgrade = 0;
    int totalcredit = 0;
    float cgpa;

    cout << "ENTER NUMBER OF SUBJECTS: ";
    cin >> n;

    vector<float> grade(n);
    vector<int> credit(n);

    for(int i = 0; i < n; i++) {
        cout << "ENTER YOUR GRADE: ";
        cin >> grade[i];
        cout << "ENTER ITS CREDIT: ";
        cin >> credit[i];

        totalgrade += grade[i] * credit[i];
        totalcredit += credit[i];
    }

    if(totalcredit == 0) {
        cgpa = 0;
    } else {
        cgpa = totalgrade / totalcredit;
    }

    for(int i = 0; i < n; i++) {
        cout << "YOUR GRADE : " << grade[i]
             << " AND ITS CREDIT : " << credit[i] << endl;
    }

    cout << "YOU HAVE SCORED " << cgpa << " CGPA" << endl;
    cout << "CONGRATULATIONS" << endl;

    return 0;
}
