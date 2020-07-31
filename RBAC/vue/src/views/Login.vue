<template>
    <div class="container">
        <el-form style="text-align: center" ref="form" :model="form" label-width="80px" class="login-page">
            <h2>权限控制系统</h2>
            <el-form-item label="用  户:" prop="username">
                <el-input v-model="form.username" placeholder="请输入用户名">
                    <el-button slot="prepend" icon="el-icon-user"></el-button>
                </el-input>
            </el-form-item>
            <el-form-item label="密 码:">
                <el-input v-model="form.password" type="password" placeholder="请输入密码">
                    <el-button slot="prepend" icon="el-icon-key"></el-button>
                </el-input>
            </el-form-item>
            <el-button type="primary" icon="el-icon-user-solid" >登 录</el-button>
        </el-form>
    </div>
</template>

<script>
    export default {
        name: "Login",
        data() {
            return {
                form: {
                    username: "",
                    password: ""
                }
            };
        },
        methods: {}
    }
</script>

<style scoped>
    .container {
        margin-top: 100px;
        width: 100%;
        height: 100%;
    }
    .login-page {
        border-radius: 5px;
        margin: auto;
        width: 350px;
        padding: 35px 55px 15px;
        background: #fff;
        border: 1px solid #eaeaea;
        box-shadow: 0 0 25px #cac6c6;
    }
</style>