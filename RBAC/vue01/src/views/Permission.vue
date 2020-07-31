<template>
  <div>

    <table>
      <tr>
        <td>id</td>
        <td>name</td>
      </tr>
      <tr v-for="permission in permissions" >
        <td><a href="#">{{permission}}</a></td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "Permission",
  data() {
    return {
      permissions: [
        {
          id: 1,
          name: "aaa"
        },
        {
          id: 2,
          name: "bbb"
        }
      ]
    };
  },
  created() {
    const _this = this;
    axios.get("http://localhost:6001/query").then(function(resp) {
      _this.permissions = resp.data;
      console.log(resp.data)
    });
  }
};
</script>

<style scoped></style>
