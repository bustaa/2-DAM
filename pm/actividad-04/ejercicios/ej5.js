import { StyleSheet, View } from "react-native";
import { useState } from 'react';

export default function App() {
  const [figure1, setFigure] = useState([
    { style: styles.topLeftCircle, size: 100},
    { style: styles.topRightCircle, size: 100},
    { style: styles.bottomLeftCircle, size: 100},
    { style: styles.bottomRightCircle, size: 100}
  ]);
  const [figure2, setFigure2] = useState([
    { style: styles.topLeftCircle, size: 75},
    { style: styles.topRightCircle, size: 75},
    { style: styles.bottomLeftCircle, size: 75},
    { style: styles.bottomRightCircle, size: 75}
  ]);
  const [figure3, setFigure3] = useState([
    { style: styles.topLeftCircle, size: 50},
    { style: styles.topRightCircle, size: 50},
    { style: styles.bottomLeftCircle, size: 50},
    { style: styles.bottomRightCircle, size: 50}
  ]);

  return (
    <View style={styles.container}>
      <View style={figure1Cont}>
        {figure.map((elem, index) => (
          <View key={index} style={[elem.style, {width: elem.size, height: elem.size}]}></View>
        ))}
      </View>
      <View style={figure2Cont}>
      </View>
      <View style={figure3Cont}>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignContent: 'center',
    justifyContent: 'center',
    flexDirection: 'column'
  },
  figure1Cont: {
    flex: 1,
    alignSelf: 'center',
    flexDirection: 'row',
    flexWrap: 'wrap'
  },
  figure2Cont: {
    flex: 1,
    alignSelf: 'center',
    flexDirection: 'row',
    flexWrap: 'wrap'
  },
  figure3Cont: {
    flex: 1,
    alignSelf: 'center',
    flexDirection: 'row',
    flexWrap: 'wrap'
  },
  square: {
    width: 100,
    height: 100,
    backgroundColor: 'blue'
  },
  triangle: {
    width: 0,
    height: 0,
    backgroundColor: 'transparent',
    borderLeftWidth: 50,
    borderRightWidth: 50,
    borderBottomWidth: 100,
    borderLeftColor: 'transparent',
    borderRightColor: 'transparent',
    borderBottomColor: 'blue'
  },
  rectangle: {
    width: 200,
    height: 100,
    backgroundColor: 'blue'
  },
  circle: {
    width: 100,
    height: 100,
    borderRadius: 100/2,
    backgroundColor: 'green'
  },
  topLeftCircle: {
    width: 100,
    height: 100,
    borderTopLeftRadius: 150,
    borderTopRightRadius: 0,
    borderBottomLeftRadius: 0,
    borderBottomRightRadius: 0,
    backgroundColor: 'blue'
  },
  topRightCircle: {
    width: 100,
    height: 100,
    borderTopLeftRadius: 0,
    borderTopRightRadius: 150,
    borderBottomLeftRadius: 0,
    borderBottomRightRadius: 0,
    backgroundColor: 'red'
  },
  bottomLeftCircle: {
    width: 100,
    height: 100,
    borderTopLeftRadius: 0,
    borderTopRightRadius: 0,
    borderBottomLeftRadius: 150,
    borderBottomRightRadius: 0,
    backgroundColor: 'red'
  },
  bottomRightCircle: {
    width: 100,
    height: 100,
    borderTopLeftRadius: 0,
    borderTopRightRadius: 0,
    borderBottomLeftRadius: 0,
    borderBottomRightRadius: 150,
    backgroundColor: 'blue'
  }
})