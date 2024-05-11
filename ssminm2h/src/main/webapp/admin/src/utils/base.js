const base = {
    get() {
        return {
            url : "http://localhost:8080/ssminm2h/",
            name: "ssminm2h",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssminm2h/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序考试系统"
        } 
    }
}
export default base
