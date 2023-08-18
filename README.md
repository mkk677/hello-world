# git 설치

https://git-scm.com

## 설치 후 Git bash 열기

git bash 에서 환경설정 하기 

### 유저 이름 설정 


```
git config --global user.name "your_name"
```

### 유저 이메일 설정 

```
git config --global user.email "your_email"
```

### 정보 확인하기 


```
git config --list
```

## Github에 처음 코드 업로드 하기 

### 1.초기화

```
git init
```

### 2.추가할 파일 더하기

```
git add .
```

.(점) 은 모든 파일이라는 뜻, 선택적으로 올리고 싶으면 add 뒤에 파일 이름 붙여주면 됨(예. git add index.html)

### 3.상태 확인(선택사항)

```
git status
```

### 4.히스토리 만들기

```
git commit -m "first commit"
```

-m 은 메세지의 준말로 뒤에 “” 안에 주고싶은 히스토리 이름을 주면 됨 (즉, first commit일 필요가 없다는 뜻)

### 5.Github repository랑 내 로컬 프로젝트랑 연결 

```
git remote add origin https://github.com/mkk677/hello-world.git
```

이 명령어는 github 에서 복사해서 붙여와야함. 


### 6.잘 연결됬는지 확인(선택사항)

```
git remote -v
```

내가 연결한 주소값이 잘 뜨면 완료!


### 7.Github로 올리기 

```
git push origin master
```

master 자리에는 branch이름이 들어가면 됨 branch 이름이 world 라면 git push origin world 라고 써야함.


## Github에 계속 업데이트 하는 법

### 1.추가할 파일 더하기

```
git add.
```

### 2.히스토리 만들기

```
git commit -m "first commit"
```

### 3.Github로 올리기

```
git push origin master
```
내 컴퓨터에 소스코드를 업데이트를 하고 싶으면 이 세개의 스텝만 계속 반복하면 됨.


## Github로 팀프로젝트 하는 법

### 1.Github에서 소스코드 다운로드

```
git clone 주소 폴더이름
```


### 2.히스토리 만들기

```
git commit -m "first commit"
```

### 3.Github로 올리기

```
git push origin master
```
내 컴퓨터에 소스코드를 업데이트를 하고 싶으면 이 세개의 스텝만 계속 반복하면 됨.

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
