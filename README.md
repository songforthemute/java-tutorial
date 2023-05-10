# 목차

- [작성 환경](#작성-환경)
- [개발 환경 구성](#개발-환경-구성)
- [자주 사용하는 터미널 명령어](#자주-사용하는-터미널-명령어)

---

### 작성 환경

- 운영체제 : MacOS 12.6 Monterey
- 개발환경 : Intellij IDEA CE
- JDK : Azul Zulu 17.0

---

### 개발 환경 구성

- [**Intellij IDEA** 다운로드](https://www.jetbrains.com/idea)
- **JDK**
    - **Oracle JDK**
        - [Oracle Official Site](https://www.oracle.com/kr/java/technologies/downloads) - Oracle 계정 필요
        - [Homebrew Official Docs](https://formulae.brew.sh/cask/oracle-jdk)
    - **Open JDK**
        - **Azul Zulu**
            - [Azul Official Site](https://www.azul.com/downloads/?package=jdk#zulu)
            - [Homebrew Official Docs](https://formulae.brew.sh/cask/zulu#default)


- **_References_**
    - [[MacOS] Zulu JDK17 설치하는 방법 (Monterey 대응)](https://freedeveloper.tistory.com/198)
    - [LINE의 OpenJDK 적용기: 호환성 확인부터 주의 사항까지](https://engineering.linecorp.com/ko/blog/line-open-jdk)
    - [주요 4개 Oracle Java 대안과 비교](https://www.azul.com/ko-kr/java-alternative-vendors/)

---

### 자주 사용하는 터미널 명령어

    Ctrl + F로 검색하세요!

- ```pwd``` 현재 작업중인 디렉터리 확인
- ```cd <dir>``` 지정한 디렉터리 \<dir>로 현재 작업중인 디렉터리 변경
- ```mkdir <dir>``` 새 디렉터리 \<dir> 생성
- ```git init``` 로컬 리포지토리에 대한 메타데이터를 포함하는 새 .git 디렉터리 생성
- ```git add <file1> <file2> ...``` 로컬 리포지토리에 개별적으로 \<file1>, \<file2>, ... 추가
- ```git add <dir>``` 로컬 리포지토리에 \<dir> 디렉터리와 디렉터리 내의 모든 파일 추가
- ```git add .``` 로컬 리포지토리에 현재 디렉터리에 있는 모든 파일을 추가
- ```git commit -m "message"``` 추적하고 있는 파일에 대한 변경 내용을 로컬 리포지토리에 "message" 커밋 메시지로 커밋
- ```git push <remote> <branch>``` 현재 작업 중인 로컬 리포지토리의 커밋 변경점을 \<remote>라는 원격 리포지토리의 \<branch> 브랜치에 반영
- ```git push -u <remote> <branch>``` 현재 작업 중인 로컬 리포지토리의 커밋 변경점을 \<remote>라는 원격 리포지토리의 \<branch> 브랜치에 반영하고, 브랜치 마스터로 지정(
  브랜치명은 현재 작업 중인 로컬 브랜치명으로 지정)
- ```git status``` 로컬 리포지토리의 추적중인 모든 파일 목록 확인
- ```git log``` 로컬 리포지토리에 커밋된 모든 커밋 목록 확인
- ```git diff``` 로컬 리포지토리의 현재 상태와 이전 커밋 시 상태의 차이 확인
- ```git remote``` 로컬 리포지토리와 연결된 모든 원격 리포지토리 목록 확인
    - ```-v``` 로컬 리포지토리와 연결된 모든 원격 리포지토리 목록과 URL을 확인
- ```git remote add <remote> <url>``` 로컬 리포지토리에 \<remote>라는 이름으로 원격 리포지토리를 추가하고, 이 \<remote>에 연결된 URL을 \<url>로 설정
- ```git pull <remote> <branch>``` 원격 리포지토리 \<remote>의 \<branch> 브랜치에서 변경된 내용을 로컬 저장소의 브랜치에 가져와 병합(merge)
    - ```--no-rebase``` 기본값으로, 원격 리포지토리에서 가져온 변경 사항을 현재 브랜치에 병합 커밋으로 추가
    - ```--rebase``` 로컬 리포지토리에서 현재 브랜치에 존재하던 변경점을 임시로 저장해두었다가, 원격 리포지토리에서 가져온 변경 사항을 현재 브랜치의 앞부분에 새로운 기반(rebase)으로 적용시킨
      뒤, 앞서 임시로 저장한 로컬의 변경점을 다시 적용
    - ```--squash``` 원격 저장소 \<remote>의 <branch>에서 가져온 변경 사항을 현재 브랜치에 하나의 커밋으로 압축하여 추가
    - ```--no-squash``` 원격 저장소 \<remote>의 \<branch>에서 가져온 변경 사항을 개별 커밋으로 유지하여 추가

---

### 인텔리제이 단축키

- ```Command + Option + ```

- **_References_**
    - [가장 많이 사용되는 IntelliJ IDEA 단축키 15개](https://blog.jetbrains.com/ko/2020/03/11/top-15-intellij-idea-shortcuts_ko/)
    - [저평가된 IntelliJ IDEA 단축키 소개](https://blog.jetbrains.com/ko/idea/2022/11/top-underrated-shortcuts/)
    - [[IntelliJ]Java Format 설정과 Save Action 플러그인](https://tryto-han.tistory.com/2)