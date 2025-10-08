import { useState } from 'react';
import { Text, TextInput, View, Pressable, StyleSheet, Alert } from 'react-native';

export default function App() {
  const [myArray, setMyArray] = useState([]);
  const [text, setText] = useState("");

  const handleOnPress = (num) => {
    if (num.trim() === "") {
      new Alert("No se ha introducido nada.")
    } else if (isNaN(num)) {
      new Alert("Se ha introducido texto.")
    } else {
      let newArray = [...myArray];
      newArray.push(num);
      setMyArray(newArray);
    }
  };

  return (
    <View style={styles.container}> 
      <TextInput
        style={{ height: 40 }}
        placeholder='Inserta un numero...'
        onChangeText={(newText) => setText(newText)}
        defaultValue={text}
      />
      <Pressable onPress={() => handleOnPress(text)}>
        <Text style={styles.text}>PULSA...</Text>
      </Pressable>
      <Text>{myArray}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center'
  },
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'lightblue',
    borderRadius: 8,
    padding: 6
  }
});