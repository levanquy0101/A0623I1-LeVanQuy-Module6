import axios from "axios";

export const auth = async (item) => {
    try {
        const temp = await axios.post("http://localhost:8080/api/login",item);
        return temp.data;
    } catch (e) {
        console.log(e)
        throw new Error("Không thể đăng nhập!")
    }
}