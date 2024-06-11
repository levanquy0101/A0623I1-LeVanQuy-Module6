import axios from "axios";

export const get = async (user_name) => {
    try {
        const temp = await axios.get(`http://localhost:8080/api/${user_name}`);
        return temp.data;
    } catch (e) {
        console.log(e)
        throw new Error("Không thể lấy thông tin của Manager!")
    }
}

export const changePass = async (item) => {
    try {
        const temp = await axios.post("http://localhost:8080/",item);
        return temp.data;
    } catch (e) {
        console.log(e)
        throw new Error("Không thể thêm mới!")
    }
}
export const save = async (item) => {
    try {
        const temp = await axios.post(`http://localhost:8080/api/user/create`,item);
        return temp.data;
    } catch (e) {
        console.log(e)
        throw new Error("Không thể thêm mới!")
    }
}