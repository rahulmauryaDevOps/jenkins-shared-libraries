def call(String url, String branch){
  echo "this is a cloning the code"
                git url: "${url}", "${branch: branch}"
                echo "code cloning successfull"
}
