#git repository(저장소)업로드하기

## 원격저장소
* https://github.com/paldonenemttin.프로젝트.git
* github.com 의 생성한 repository

## local 프로젝트
* C:/vizworks/javaworls


##git-hub 저장소 생성
1. 접속
2. github로그인
3. New Repesirary 생성
4. Biz_403_2021_03_Java 이름 저장하고 create...

1. https://github.com/paldonenemttin
2. github 로그인
3. New repository
4. paldonenemttin/

## local 저장소 설정(생성)
*local 프로젝드 폴더를 local 저장소로 설정하기
1. c:/bizworks/javaworks 폴더에서 git bash 실행
* bash shell 화면 나타남, window의 cmd창과 유사

2. local 저장소 선언
* git init

3. local 저장소를 github 계정과 연결
* git config --local user.name paldonenemttin
* git config --local user.email aipro0124@naver.com

4. local프로젝트 압축준비
* 압축금지 파일 설정
* . touch .gitignore 로 파일 생성
* .gitignore 파일을 sublime text로 열어서 압축금지 파일 정보 등록

5. local 프로젝트를 압축하여 local 저장소에 옮길 준비를 하라
* git add .

6. local 저장소에 옮겨라
* git commit -m "comment"

7. local 저장소에 있는 파일들을 원격저장소로 업로드하라
* git push http://.git master


## 원격저장소와 연결된 프로젝트에 새로운 코드 추가하기
* git add .
* git commit -m "Hello_02 추가"
*

## 원격저장소 주소를 단축하여 입력하기
1. 원격저장소 주소를 별명으로 설정하기
* git remote add origin https://github.com/paldonenemttin/Biz_403_2021_03_Java.git
 
* git push -u origin master

* git push 