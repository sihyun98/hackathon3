<template>
    <nav>
        <v-navigation-drawer v-model="drawer" dark app mini-variant mini-variant-width="100" class="orange darken-3">

            <v-list style="position: absolute; top:0" class="ml-3" flat>
                <v-img
                  :src="require('../assets/imglogo1.png')"
                  width="80"
                />
            </v-list>

            <v-list>
                <v-list-item class="mb-12">
                    <v-list-item-action>

                    </v-list-item-action>
                </v-list-item>
            </v-list>
            <v-list flat>
                <div v-if="ifLoggedIn === true ">
                <!-- <v-if this.$session.get('user_no') > 0 -->
                    <v-list-item @click='moveHome'>
                        <v-list-item-content>
                            <v-icon class="mb-2">fas fa-house-user</v-icon>
                            <v-list-item-subtitle align="center">우리집</v-list-item-subtitle>
                        </v-list-item-content>
                    </v-list-item>
                </div>
                <div v-else>
                    <v-list-item>
                        <v-list-item-content>
                            <v-icon class="mb-2">fas fa-house-user</v-icon>
                            <v-list-item-subtitle align="center">우리집</v-list-item-subtitle>
                        </v-list-item-content>
                    </v-list-item>
                </div>

                <v-list-item @click='moveRankingLsit'>
                    <v-list-item-content>
                        <v-icon class="mb-2">fas fa-search</v-icon> 
                        <v-list-item-subtitle align="center">옆집</v-list-item-subtitle>
                    </v-list-item-content>
                </v-list-item>
                <!-- <v-list-item router to="/">
                    <v-list-item-content>
                        <v-icon class="mb-2">fas fa-list</v-icon>
                        <v-list-item-subtitle align="center">게시판</v-list-item-subtitle>
                    </v-list-item-content>
                </v-list-item> -->
                <!-- <v-list-item router to="/">
                    <v-list-item-content>
                        <v-icon class="mb-2">fas fa-signature</v-icon>
                        <v-list-item-subtitle align="center">Tracker</v-list-item-subtitle>
                    </v-list-item-content>
                </v-list-item> -->
            </v-list>
            <v-list style="position: absolute; bottom:0" class="ml-3" flat>
                <v-list-item router to="/">
                    <v-list-item-action>
                        <v-icon right>fas fa-sign-out-alt</v-icon>
                    </v-list-item-action>
                </v-list-item>
            </v-list>

        </v-navigation-drawer>
    </nav>
</template>
<script>
export default {
    data: () => ({
        drawer: true,
        ifLoggedIn: false,
    }),
    created() {
        console.log(this.ifLoggedIn);
        if(this.$session.get('user_no') != 0){
            this.ifLoggedIn = true;
        }
    },
    methods: {
        moveHome(){
        // console.log("index : " + index);
        this.$router.push({
        name: 'Home',
        // params: {"id" : 1}
        });
        
    },
        moveRankingLsit(){
            // console.log("index : " + index);
            this.$router.push({
            name: 'RankingList',
            // params: {"id" : 1}
            });
        
    }
    },
}
</script>