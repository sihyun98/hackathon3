<template>
  <v-container fluid fill-height>
    <v-layout align-center justify-center>
      <v-flex xs12 sm8 md4>
        <v-card class="elevation-12">
          <v-toolbar dark color="orange darken-3">
            <v-toolbar-title>Login</v-toolbar-title>         
            <v-spacer></v-spacer>
          </v-toolbar>
          <v-card-text>
            <v-form>
              <!-- <v-text-field prepend-icon="person" v-model="form.id" label="아이디" type="text"></v-text-field>
              <v-text-field prepend-icon="lock" v-model="form.pwd" label="비밀번호" type="password"></v-text-field> -->
              <v-text-field
                prepend-icon="person"
                ref="username"
                v-model="username"
                :rules="[() => !!username || '필수 입력 항목입니다.']"
                label="아이디"
                placeholder=""
                required
              ></v-text-field>
              <v-text-field
                prepend-icon="lock"
                ref="password"
                v-model="password"
                :rules="[() => !!password || '필수 입력 항목입니다.']"
                label="비밀번호"
                placeholder=""
                required
              ></v-text-field>
            </v-form>
          </v-card-text>
          <v-card-actions>
            <v-btn 
              color="orange darken-3"
              text
              @click="join"
              >
                회원가입
            </v-btn>
            <v-spacer></v-spacer>
            <!-- <v-btn color="primary" @click="signIn">로그인</v-btn> -->
            <v-btn
              color="orange darken-3"
              text
              @click="submit"
            >
              로그인
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-flex>
    </v-layout>
  </v-container>


  <!-- <v-row justify="center">
    <v-col
      cols="12"
      sm="10"
      md="8"
      lg="6"
    >
      <v-card ref="form">
        <v-card-text>
          <v-text-field
            ref="username"
            v-model="username"
            :rules="[() => !!username || '필수 입력 항목입니다.']"
            label="사용자 아이디"
            placeholder=""
            required
          ></v-text-field>
          <v-text-field
            ref="password"
            v-model="password"
            :rules="[() => !!password || '필수 입력 항목입니다.']"
            label="비밀번호"
            placeholder=""
            required
          ></v-text-field>
          
        </v-card-text>
        <v-divider class="mt-12"></v-divider>
        <v-card-actions>
          <v-btn text>
            취소
          </v-btn>
          <v-spacer></v-spacer>
          <v-btn
            color="primary"
            text
            @click="submit"
          >
            로그인
          </v-btn>
          <childhome v-bind:num="index"></childhome>
        </v-card-actions>
      </v-card>
    </v-col>
  </v-row> -->

</template>

<script>
import axios from "axios"
// import ChildHome from "./Home.vue"

  export default {
    // components: {
    //     childhome: ChildHome
    // },
    data: () => ({
      username: null,
      password: null,
    //   index: 0
    }),

    computed: {
      form () {
        return {
          username: this.username,
          password: this.password,
        }
      },
    },

    watch: {
      name () {
        this.errorMessages = ''
      },
    },

    methods: {
      submit () {
        //   this.$getId(this.form);
        //   location.href = "home";

          axios.post('/api/member/signin', this.form)
          .then(res => {
              if(res.data.code == "OK"){
                //   this.index = res.data.message;
                //   console.log(this.index);
                this.moveParams(res.data.message);
                  // location.href = "home";
              }
              else{
                  console.log("아이디 또는 비밀번호를 확인해주세요.");
              }
          })
      },
      moveParams(index){
        console.log("index : " + index);
        this.$router.push({
        name: 'Home',
        params: {"id" : index}
        });
      },
      join () {
        this.$router.push({
        name: 'SignUp' 
        });
      }
    },
  }
</script>