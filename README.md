## Elements of Programming Interviews

Here are my solutions to problems I consider relevant from [*Elements of Programming Interviews*](https://www.amazon.com/Elements-Programming-Interviews-Java-Insiders/dp/1517671272/ref=sr_1_1) by Adnan Aziz, Tsung-Hsien Lee, and Amit Prakash.

To run a solution on your Windows machine &ndash;

* Open your command prompt (`Windows key`, type "cmd", `Enter`)
* Install [Scoop](https://scoop.sh).
* Use Scoop to install Java.
* Clone this repository.
* Run a solution by entering "run" followed by part of the filename (e.g. `run MergeTwoSortedLists`).

```
powershell Set-ExecutionPolicy RemoteSigned -scope CurrentUser
powershell iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
scoop bucket add java
scoop install openjdk
git clone https://github.com/denialromeo/elements-of-programming-interviews.git
cd elements-of-programming-interviews
run MergeTwoSortedLists
```